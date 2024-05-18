package quanLiHocSInh;

import java.util.ArrayList;
import java.util.Comparator;

public class SapXepTheoTen implements khaNangSapXep{
    @Override
    public void sapXep(ArrayList<HocSinh> hocSinhs) {
        hocSinhs.sort(Comparator.comparing(HocSinh::layTen));
    }
}
