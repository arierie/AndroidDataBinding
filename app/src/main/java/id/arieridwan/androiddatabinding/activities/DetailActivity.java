package id.arieridwan.androiddatabinding.activities;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.arieridwan.androiddatabinding.R;
import id.arieridwan.androiddatabinding.databinding.ActivityDetailBinding;
import id.arieridwan.androiddatabinding.viewmodels.DetailActivityVM;

public class DetailActivity extends AppCompatActivity {

    // deklarasi variable sebagai argumen untuk memulai activity
    public static final String ARG_JUDUL = "key_judul";
    public static final String ARG_PENGARANG = "key_pengarang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        // mendapatkan data dari intent
        Intent i = getIntent();
        String judul = i.getStringExtra(ARG_JUDUL);
        String pengarang = i.getStringExtra(ARG_PENGARANG);
        DetailActivityVM viewModel = new DetailActivityVM(judul,pengarang);
        // set vm akan otomatis ada ketika kita menamai vaiable di xml
        binding.setVm(viewModel);
    }

    // method untuk memulai activity ini
    public static void startThisActivity(Context context, String judul, String pengarang) {
        // start activity
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(ARG_JUDUL, judul);
        intent.putExtra(ARG_PENGARANG, pengarang);
        context.startActivity(intent);
    }
}
