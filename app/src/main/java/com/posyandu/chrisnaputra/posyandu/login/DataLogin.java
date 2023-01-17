package com.posyandu.chrisnaputra.posyandu.login;

public class DataLogin {

    private String status;
    private String pesan;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String nama;
        private String peran;
        private String no_staf;
        private String username;
        private String no_telp;
        private String alamat;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNo_telp() {
            return no_telp;
        }

        public void setNo_telp(String no_telp) {
            this.no_telp = no_telp;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getPeran() {
            return peran;
        }

        public void setPeran(String peran) {
            this.peran = peran;
        }

        public String getNo_staf() {
            return no_staf;
        }

        public void setNo_staf(String no_staf) {
            this.no_staf = no_staf;
        }
    }
}
