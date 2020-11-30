package simple.example.catalog_buku_pedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.catalog_buku_pedia.modelbuku.Fiksi;
import simple.example.catalog_buku_pedia.modelbuku.NonFiksi;
import simple.example.catalog_buku_pedia.modelbuku.Buku;

public class DataBuku {
    private static List<Buku> bukus = new ArrayList<>();

    private static List<Fiksi> inttDataFiksi(Context ctx) {
        List<Fiksi> fiksis = new ArrayList<>();
        fiksis.add(new Fiksi("Jangan Baca Buku Ini Jika Belum Ingin Taubat", "Grand Media/Uztadzah Ummi Al-Kholil",
                "Kehidupan manusia sering dikerubuti oleh kemaksiatan dan keinginan berbuat maksiat. Tetapi, manusia juga diberi anugerah oleh Allah akan bagaimana menjaga diri dari perbuatan maksiat dan menjauhi kemaksiatan. Menjadi muslim adalah usaha terus-menerus untuk menjadi lebih balk dan lebih baik lagi sehingga menjadi manusia yang Ahsani Taqwim. ",
                R.drawable.fiksi_jangan_baca));
        fiksis.add(new Fiksi("Jago Bola Basket", "Grand Media/Lulu Lukyani",
                "Basket merupakan olahraga yang cukup populer ,tidak kalah dikenal seperti sepak bola. Basket juga merupakan olahraga tim yang menyenangkan dan cukup bergensi untuk dikenal dan heran jika banyak yang ingin belajar memainkan olahraga ini mulai dari anak-anak ,remaja,hingga orang dewasa . Bagi kamu yang ingin mengenal olahraga bola basket lebih dekat, awal mula olahraga ini ada,kapan dan dimana,bagaimana memainkannya pola latihanya apa saja istilahnya yang biasanya ada dalam olahraga ini buku ini mencoba mengenalkan itu semuah untuk kita supaya bisa lebih dekat mengenal olahraga basket.",
                R.drawable.buku_bola_basket));
        fiksis.add(new Fiksi("Bukan Buku Nikah", "Grand Media/Ria Ricis",
                "Ketika kita belum siap mencintai diri sendiri",
                R.drawable.bukan_buku_fiksi_nikah));
        fiksis.add(new Fiksi("Baca Buku Ini Saat Lelah", "Grand Media/Munita Yeni",
                "Terkadang kita terlalu sibuk mencintai ini dan itu bahkan sampai kita lupa untuk mencintai diri sendiri, dan itu sungguh melelahkan. Mengapa manusia mulai lupa bagaimana cara untuk mencintaii dirinya sendiri? Bukankah sangat melelahkan ketika kalian ditinggalkan seseorang? Jika diri kalian sendiri yang meninggalkan dirimu, betapa sunyinya?\n" +
                        "Penelitian di Carnegei Mellon University mengatakan bahwa rasa cinta menghasilkan emosi yang positif, hal ini mendorong sistem kekebalan tubuh orang tersebut menjadi lebih sehat.",
                R.drawable.baca_buku_ini_fiksi));
        return fiksis;
    }

    private static List<NonFiksi> iniDataNonFiksi(Context ctx) {
        List<NonFiksi> nonFiksis = new ArrayList<>();
        nonFiksis.add(new NonFiksi("Buku Pintar Wayang", "Grand Media/Tristanti Tri Wahyuni",
                "Buku ini berisi beberapa pengetahuan dasar terkait kesenian wayang. Mulai dari sejarah, pengenalan tokoh-tokohnya  beserta pusaka dan kereta kudanya, hingga unsur-unsur yang diperlukan dalam kesenial wayang. Seluruh materi disampaikan dengan bahasa ringan, sehingga mudah dipahami. Harapannya buku ini dapat mengenalkan, memahamkan dan pada akhirnya turut mencintai kesenian wayang.\n", R.drawable.nonfiksi_buku_pintar_wayang));
        nonFiksis.add(new NonFiksi("Buku Pintar Video Editing", "Grand Media/Su Rahman",
                "Kebutuhan akan konten multimedia menjadi sangat penting, mulai untuk promosi hingga untuk kebutuhan YouTube dan sebagainya. Menghasilkan video sekarang ini sangat mudah, namun video yang dihasilkan itu tidak bisa langsung ditampilkan begitu saja. Dibutuhkan editing terlebih dahulu agar maksud dan tujuan dari video tersebut bisa tercapai. Untuk editing dibutuhkan sebuah software.", R.drawable.nonfiksi_video_editing));
        nonFiksis.add(new NonFiksi("Teori Hukum", "Grand Media/Proof.Dr.Abdussalam",
                "Bahwa Materi Legal Theory yang ditults oleh ■1 Fricdrnapn tersebut menjadi pisau analisis dalam melakukan penelnian dan penulisan pada setiap buku yang telah dipuhlikasikan. Karena materi Legal Thecny tersebut masilt sangal rele•an sampai saat ini untuk dijadikan pisan analisis pada kondisi hukum di Ncgara Indonesia.", R.drawable.teori_hukum_non_fiksi));
        nonFiksis.add(new NonFiksi("Buku Ajar Pendidikan", "Grand Media/Sumiaty",
                "Materi yang dibahas dalam buku ini meliputi :\n" +
                        "▪ Bab 1 Konsep Dasar Pendidikan Karakter\n" +
                        "▪ Bab 2 Pentingnya Pendidikan Karakter\n" +
                        "▪ Bab 3 Pendekatan Pendidikan Karakter\n" +
                        "▪ Bab 4 Strategi Implementasi Pendidikan Karakter\n" +
                        "▪ Bab 5 Implementasi Pendidikan Karakter Pada Mahasiswa Kebidanan\n" +
                        "▪ Bab 6 Studi Kasus Implementasi Pendidikan Karakter di Institusi Kebidanan", R.drawable.nonfiksi_pendidikan_karaketer));
        nonFiksis.add(new NonFiksi("Buku Ajar Parasitologi", "Grand Media/Hebert Ardianto",
                "Parasit merupakan organisme yang tinggal di dalam tubuh atau pada hospes serta membawa penyakit kepada hospes. Parasit bersifat merugikan karena dapat menimbulkan sakit maupun kematian pada hospes yang ditumpangnya. Banyak penyakti di Indonesia akibat parasit secara langsung maupun diperantarai oleh vektor, seperti malaria, skabies, amubiasis, toksoplasmosis, kaki gajah, kecacingan, demam berdarah, zica, chikungunya, dan lain-lain. Kemampuan mengidentifikasi parasit, baik morfologi maupun biologinya sangatlah penting sebelum mengambil tindakan pengobatan maupun pencegahannya.", R.drawable.buku_ajar_non_fiksi));
        nonFiksis.add(new NonFiksi("Sherlock Hormels", "Grand Media/Sir Arthur",
                "Dalam buku ini, dihadirkan cerita-cerita terbaik yang akan mengajak pembaca bertualang mendampingi Sherlock Holmes dan Dokter Watson mengungkap berbagai kejahatan yang mengancam kedamaian London dan juga Eropa. termasuk pertemuan dengan sang rival terberat, Profesor Moriarty yang demikian melegenda.", R.drawable.non_fiksi_sherlock));
        return nonFiksis;

    }

    private static void initAllBukus(Context ctx) {
        bukus.addAll(iniDataNonFiksi(ctx));
        bukus.addAll(inttDataFiksi(ctx));
    }

    public static List<Buku> getAllBuku(Context ctx) {
        if (bukus.size() == 0) {
            initAllBukus(ctx);
        }
        return bukus;
    }

    public static List<Buku> getBukusByTipe(Context ctx, String jenis) {
        List<Buku> bukusByType = new ArrayList<>();
        if (bukus.size() == 0) {
            initAllBukus(ctx);
        }
        for (Buku h : bukus) {
            if (h.getJenis().equals(jenis)) {
                bukusByType.add(h);
            }
        }
        return bukusByType;
    }
}
