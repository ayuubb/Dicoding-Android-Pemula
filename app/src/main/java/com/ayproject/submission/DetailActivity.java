package com.ayproject.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";
    ImageView imgPhoto;
    TextView tvName,tvChipset, tvMemori, tvCamera, tvBatre, tvDetail, tvHarga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPhoto = findViewById(R.id.img_detail);
        tvName = findViewById(R.id.name_detail);
        tvChipset = findViewById(R.id.chipset_detail);
        tvMemori = findViewById(R.id.memori_detail);
        tvCamera = findViewById(R.id.kamera_detail);
        tvBatre = findViewById(R.id.kamera_detail);
        tvDetail = findViewById(R.id.isi_detail);
        tvHarga = findViewById(R.id.harga_detail);

        Handphone handphone = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (handphone != null) {
            Glide.with(this)
                    .load(handphone.getPhoto())
                    .into(imgPhoto);
            tvName.setText(handphone.getName());
            tvChipset.setText(handphone.getChipset());
            tvMemori.setText(handphone.getMemori());
            tvCamera.setText(handphone.getKamera());
            tvBatre.setText(handphone.getBatre());
            tvDetail.setText(handphone.getDetail());
            tvHarga.setText((handphone.getHarga()));

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}