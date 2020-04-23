/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Zulfa
 */
public class Operasi {
    private static List<Data> listData = new  LinkedList<>();

    public static void addData(Data data) {
    listData.add(data);
    }

    public static void editData(Data data, int ii) {
        listData.set(ii, data);
    }

    public static void removeData(int ii) {
       listData.remove(ii);
    }

    public static List<Data> getListData() {
      return listData;
    }
    
}
