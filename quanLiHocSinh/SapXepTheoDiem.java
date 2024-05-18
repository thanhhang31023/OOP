package quanLiHocSInh;

import java.util.ArrayList;
import java.util.Comparator;

public class SapXepTheoDiem implements khaNangSapXep {
    @Override
    public void sapXep(ArrayList<HocSinh> hocSinhs) {
        hocSinhs.sort(Comparator.comparingDouble(HocSinh::layDiem));
    }
}
