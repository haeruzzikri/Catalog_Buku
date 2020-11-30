package simple.example.catalog_buku_pedia.modelbuku;

public class Buku {
    private String jenis;
    private String NamaBuku;
    private String penerbit;
    private String deskripsi;
    private int drawableRes;

    public Buku (String jenis, String NamaBuku, String penerbit, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.NamaBuku = NamaBuku;
        this.penerbit = penerbit;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNamaBuku() {
        return NamaBuku;
    }

    public void setNamaBuku(String NamaBuku) {
        this.NamaBuku = NamaBuku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}