package object;

public class shape {

    private int chieudai;
    private int chieurong;

    public shape(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }


    public int getChieudai() {
        return chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    public int dientich(){
         return this.chieudai * this.chieurong;

    }

    public int chuvi(){
        return (this.chieurong+this.chieudai)*2;
    }
}
