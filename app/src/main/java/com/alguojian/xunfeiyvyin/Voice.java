package com.alguojian.xunfeiyvyin;

import java.util.ArrayList;

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/10/11
 */
public class Voice {
    public ArrayList<WSBean> ws;

    public static class WSBean {
        public ArrayList<Voice.CWBean> cw;
    }

    public class CWBean {
        public String w;
    }
}
