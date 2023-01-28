package Chap_07;

public class BlackboxRefurbish {

    public String modleName;
    String resolution; // default
    private int price;
    protected String color;

    public String getModleName() {
        return modleName;
    }

    public void setModleName(String modleName) {
        this.modleName = modleName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }
        public void setResolution (String resolution){
            this.resolution = resolution;
        }

        public int getPrice () {
            return price;
        }

        public void setPrice ( int price) {
            if (price < 100000) {
                this.price = 100000;
            } else {
                this.price = price;
            }
        }
            public String getColor() {
                return color;
            }

            public void setColor (String color) {
                this.color = color;
            }
}

