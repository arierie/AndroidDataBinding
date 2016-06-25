package id.arieridwan.androiddatabinding.viewmodels;

import android.databinding.ObservableField;
import android.view.View;

import id.arieridwan.androiddatabinding.activities.DetailActivity;
import id.arieridwan.androiddatabinding.activities.MainActivity;

/**
 * Created by root on 23/06/16.
 */
public class MainActivityVM {
    // inisialisasi variable
    public ObservableField<String> bTextInputJudul = new ObservableField<>();
    public ObservableField<String> bTextInputNama = new ObservableField<>();
    public MainActivity mActivity;

    // constructor untuk mendapatkan context yang dikirim dari activity
    public MainActivityVM(MainActivity mainActivity) {
        this.mActivity = mainActivity;
    }

    // method ketika button diklik
    public void onClickSubmit(View v) {
        DetailActivity.startThisActivity(mActivity, bTextInputJudul.get(), bTextInputNama.get());
    }

}
