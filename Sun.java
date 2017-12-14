/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culminating;

import java.io.BufferedReader;

/**
 *
 * @author 557917812
 */
public class Sun {

    private BufferedReader info, shortInfo;
    private int size;

    public Sun(BufferedReader fr, BufferedReader shortInfo) {
        info = fr;
        size = 1391400;
        this.shortInfo = shortInfo;
    }

    public BufferedReader getInfo() {
        return info;
    }

    public void setInfo(BufferedReader info) {
        this.info = info;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BufferedReader getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(BufferedReader shortInfo) {
        this.shortInfo = shortInfo;
    }
}
