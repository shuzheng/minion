package cn.javay.minion.eureka;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 京东数据预处理类
 *
 * @author zss
 * @Create Date: 2016年1月26日
 */
public class MeaninglessUtil {

    private static Pattern pattern = Pattern.compile("[\u4e00-\u9fa5]");
    private static Matcher matcher;

    /**
     * 判断句子中是否只含有标点符号或只含有数字
     *
     * @param str 待判断内容
     * @return 判断结果：true 代表含有汉字
     */
    public static boolean isContainChinese(String str) {
        matcher = pattern.matcher(str);
        if (matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断标点符号占句子比例是否大于0.5
     *
     * @param str 待判断内容
     * @param ratio 比例
     * @return 判断结果：false 标点符号占句子比例一半以上的句子
     */
    public static boolean isContainPunctuation(String str, float ratio) {
        if (ratio == 0.0F) {
            ratio = 0.5F;
        }
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            String Reg = "[^\u4E00-\u9FA5a-zA_Z0-9]{1}";
            String b = Character.toString(str.charAt(i));
            if (b.matches(Reg))
                total++;
        }

        if ((float) total / (float) str.length() > ratio) { // 计算百分比
            return true;
        } else {
            return false;
        }

    }

    /**
     * 判断某字或某词字数占的比例在30%以上
     *
     * @param str 待判断内容
     * @param ratio 比例
     * @return 判断结果：true 某字或某词字数占的比例在80%以上
     */
    public static boolean isRepate(String str, float ratio) {
        if (ratio == 0.0F) {
            ratio = 0.3F;
        }
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < ch.length; i++) {
            if (!(ch[i] >= '一' && ch[i] <= '龥'))
                continue;
            Integer value = map.get(ch[i]);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            map.put(ch[i], count);
        }
        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {    //循环判断某字所占百分比
            if ((float) entry.getValue() / (float) str.length() >= ratio) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 判断中文占句子比例是否小于0.5
     *
     * @param str 待判断内容
     * @param ratio 比例
     * @return 判断结果：true 中文占句子比例一半以下
     */
    public static boolean isChineseTotal(String str, float ratio) {
        if (ratio == 0.0F) {
            ratio = 0.5F;
        }
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            String Reg = "[\u4e00-\u9fa5]{1}$";
            String b = Character.toString(str.charAt(i));
            if (b.matches(Reg))
                total++;
        }

        if ((float) total / (float) str.length() < ratio) { // 计算百分比
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String text = "如何克服考试紧张情绪？ 期中、末考试，歌唱比赛<br/><br/>";
        boolean bool = false;
        if (isRepate(text, 0.5F) ||
                isContainChinese(text) ||
                isContainPunctuation(text, 0.5F) ||
                isChineseTotal(text, 0.5F)) {
            bool = true;
        }
//        if (isContainPunctuation(text, 0.6F)) {
//            bool = true;
//        }
        System.out.print(bool);
    }
}
