package simple.example.catalog_buku_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.catalog_buku_pedia.modelbuku.Buku;

public class GaleriActivity extends AppCompatActivity {
    List<Buku> bukus;
    int indeksTampil = 0;
    String jenisBuku;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJenis,txPenerbit,txNamaBuku,txDeskripsi,txJudul;
    ImageView ivFotoBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_buku);
        Intent intent = getIntent();
        jenisBuku = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        bukus = DataBuku.getBukusByTipe(this,jenisBuku);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> bukuPertama());
        btnTerakhir.setOnClickListener(view -> bukuTerakhir());
        btnSebelumnya.setOnClickListener(view -> bukuSebelumnya());
        btnBerikutnya.setOnClickListener(view -> bukuBerikutnya());

        txJenis = findViewById(R.id.txJenis);
        txPenerbit = findViewById(R.id.txPenerbit);
        txNamaBuku = findViewById(R.id.txNamaBuku);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoBuku = findViewById(R.id.gambarBuku);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Kategori "+jenisBuku);
    }


    private void tampilkanProfil() {
        Buku k = bukus.get(indeksTampil);
        Log.d("FIKSI","Menampilkan buku fiksi "+k.getJenis());
        txJenis.setText(k.getJenis());
        txNamaBuku.setText(k.getNamaBuku());
        txPenerbit.setText(k.getPenerbit());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoBuku.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void bukuPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void bukuTerakhir() {
        int posAkhir = bukus.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void bukuBerikutnya() {
        if (indeksTampil == bukus.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void bukuSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }

}
