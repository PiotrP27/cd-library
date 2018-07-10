package cd_library.menu;

import cd_library.CD.CD;

import java.util.List;

public class CDDisplay {
    public static void show(List<CD> list) {
        list.forEach(cd -> System.out.println(cd));
    }
}
