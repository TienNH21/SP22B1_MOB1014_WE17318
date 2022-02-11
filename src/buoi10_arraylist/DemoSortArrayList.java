package buoi10_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoSortArrayList {
    public static void main(String[] args) {
        ArrayList<SvPoly> dssv = new ArrayList<SvPoly>();
        
        SvPoly sv1 = new SvPoly("Ng Van A", 6),
            sv2 = new SvPoly("Tran Thi B", 9),
            sv3 = new SvPoly("Trinh Van C", 7);

        dssv.add(sv1);
        dssv.add(sv2);
        dssv.add(sv3);
        
        // Sắp xếp dssv theo chiều điểm tăng dần
        Comparator<SvPoly> com = new Comparator<SvPoly>() {
            @Override
            public int compare(SvPoly o1, SvPoly o2) {
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        };
        
        Collections.sort(dssv, com);
        
        for (SvPoly sv: dssv) {
            sv.xuat();
        }
    }
}
