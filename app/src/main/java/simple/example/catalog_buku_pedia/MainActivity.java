package simple.example.catalog_buku_pedia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_fiksi,btn_nonfiksi;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
    btn_fiksi = findViewById(R.id.btn_buku_fiksi);
    btn_nonfiksi = findViewById(R.id.btn_buku_nonfiksi);
    btn_fiksi.setOnClickListener(view -> bukaGaleri("Fiksi"));
    btn_nonfiksi.setOnClickListener(view -> bukaGaleri("Non Fiksi"));

    }

    private void bukaGaleri(String jenisBuku) {
        Log.d("MAIN","Buka activity Fiksi");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisBuku);
        startActivity(intent);
    }

}
