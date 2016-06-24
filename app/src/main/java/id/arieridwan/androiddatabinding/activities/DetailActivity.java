package id.arieridwan.androiddatabinding.activities;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }

    // method untuk memulai activity ini
    public static void startThisActivity(Context context, String judul, String pengarang) {
        // inisialisasi viewModel
        DetailActivityVM viewModel = new DetailActivityVM();
        // start activity
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(ARG_JUDUL, judul);
        intent.putExtra(ARG_PENGARANG, pengarang);
        context.startActivity(intent);
        viewModel.setData(judul, pengarang);
    }
}
