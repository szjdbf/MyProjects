package com.zlf.game;

import com.github.stuxuhai.jpinyin.ChineseHelper;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class Game {
    public static void main(String[] args) throws Exception{
        String s="你好，世界";
        String s2=pinyinHtml(s);
        System.out.println(s2);
    }

    private static String pinyinHtml(String str) throws PinyinException {
        String py = PinyinHelper.convertToPinyinString(str, "|", PinyinFormat.WITH_TONE_MARK);
        char[] charArray = str.toCharArray();
        String[] pyArray = py.split("\\|");
        String returnStr = "";
        int j = 0;
        for(int i=0;i<pyArray.length;i++) {
            if(ChineseHelper.isChinese(charArray[j])) {
                returnStr+="<ruby>"+charArray[j]+"<rt>"+pyArray[i]+"</rt></ruby>";
                j++;
            }else {
                for(int k=j;k<charArray.length;k++) {
                    if(ChineseHelper.isChinese(charArray[j])){
                        break;
                    }
                    returnStr +=charArray[k];
                    j++;
                }
            }
        }
        return returnStr;
    }

}
