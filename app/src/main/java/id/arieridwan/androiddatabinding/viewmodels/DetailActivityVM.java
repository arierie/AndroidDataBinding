package id.arieridwan.androiddatabinding.viewmodels;

import android.databinding.ObservableField;

/**
 * Created by root on 23/06/16.
 */
public class DetailActivityVM {
    // inisialisasi variable
    public ObservableField<String> bTextJudul = new ObservableField<>();
    public ObservableField<String> bTextPengarang = new ObservableField<>();

    // constructor untuk mendapatkan judul dan pengarang yang dikirim dari activity
    public DetailActivityVM(String judul, String pengarang) {
        bTextJudul.set(judul);
        bTextPengarang.set(pengarang);
    }

}
