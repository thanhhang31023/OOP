package quanLiHocSInh;

import java.util.ArrayList;
import java.util.Comparator;

public class SapXepTheoTuoi implements khaNangSapXep {
    @Override
    public void sapXep(ArrayList<HocSinh> hocSinhs) {
        hocSinhs.sort(Comparator.comparingInt(HocSinh::layTuoi));
    }
}
