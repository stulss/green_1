public class Tamagochi {
    // 건강,피곤,슬픔,배고픔,외로움
    private int hp;
    private int sp;
    private int loneliness;
    private int happy;
    private int starve;
    private int max_hp;
    private int max_sp;
    private int max_loneliness;
    private int max_happy;
    private int max_starve;

    private static Tamagochi tama = null;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getSp() {
        return sp;
    }
    public void setSp(int sp) {
        this.sp = sp;
    }
    public int getLoneliness() {
        return loneliness;
    }
    public void setLoneliness(int loneliness) {
        this.loneliness = loneliness;
    }
    public int getHappy() {
        return happy;
    }
    public void setHappy(int happy) {
        this.happy = happy;
    }
    public int getStarve() {
        return starve;
    }
    public void setStarve(int starve) {
        this.starve = starve;
    }
    public int getMax_hp() {
        return max_hp;
    }
    public void setMax_hp(int max_hp) {
        this.max_hp = max_hp;
    }
    public int getMax_sp() {
        return max_sp;
    }
    public void setMax_sp(int max_sp) {
        this.max_sp = max_sp;
    }
    public int getMax_loneliness() {
        return max_loneliness;
    }
    public void setMax_loneliness(int max_loneliness) {
        this.max_loneliness = max_loneliness;
    }
    public int getMax_happy() {
        return max_happy;
    }
    public void setMax_happy(int max_happy) {
        this.max_happy = max_happy;
    }

    public int getMax_starve() {
        return max_starve;
    }

    public void setMax_starve(int max_starve) {
        this.max_starve = max_starve;
    }

    public Tamagochi() {
        this.hp=50;
        this.sp=50;
        this.loneliness=50;
        this.happy=50;
        this.starve=50;
        this.max_hp=100;
        this.max_sp=100;
        this.max_loneliness=100;
        this.max_happy=100;
        this.max_starve=100;
    }

    public static Tamagochi getInstance(){
        if (tama == null){
            tama = new Tamagochi();
        }
        return tama;
    }

    public void excercise(){
        if (max_hp<201){
            max_hp+=5;
            if (max_hp>200){
                max_hp=200;
            }
        }
        if (hp<max_hp){
            hp-=5;
            if (hp<0){
                hp=0;
            }

        }
        if (max_sp<201){
            max_sp+=5;
            if (max_sp>200){
                max_sp=200;
            }
        }
        if(sp<=max_sp){
            sp-=5;
            if (sp<0){
                sp=0;
            }
        }
        if(starve<=max_starve){
            starve-=5;
            if (starve<0){
                starve=0;
            }

        }
        nowStatus();

    }

    public void shower() {
        if(hp < max_hp){
            hp += 10;
            if (hp>max_hp){
                hp=max_hp;
            }
        }

        if(sp < max_sp) {
            sp -= 30;
            if (sp<0){
                sp=0;
            }

        }

        if(happy < max_happy) {
            happy += 6;
            if (happy>max_happy){
                happy=max_happy;
            }
        }
        nowStatus();

    }

    public void walk(){
        if(hp < max_hp){
            hp += 10;
            if(hp > max_hp){
                hp = max_hp;
            }
        }

        if(sp > 0){
            sp -= 10;
            if(sp < 0){
                sp = 0;
            }
        }

        if(loneliness > 0){
            loneliness -= 10;
            if(loneliness < 0){
                loneliness = 0;
            }
        }

        if(happy < max_happy){
            happy += 10;
            if(happy > max_happy){
                happy = max_happy;
            }
        }
        if(starve < max_starve){
            starve += 10;
            if(starve > max_starve){
                starve = max_starve;
            }
        }
        nowStatus();
    }

    public void sleep() {

        if (this.hp < max_hp) {
            this.hp = hp + 20;
            if (this.hp > max_hp) {
                this.hp = max_hp;
            }
        }
        if (this.sp < max_sp) {
            this.sp = sp + 30;
            if (this.sp > max_sp) {
                this.sp = max_sp;
            }
        }
        if (this.loneliness > 0) {
            this.loneliness = loneliness - 10;
            if (this.loneliness < 0) {
                this.loneliness = 0;
            }
        }
        if (this.happy < max_happy) {
            this.happy = happy + 20;
            if (this.happy > max_happy) {
                this.happy = max_happy;
            }
        }
        if (this.starve > 0) {
            this.starve = starve - 20;
            if (this.starve < 0) {
                this.starve = 0;
            }
        }
        nowStatus();
    }

    public void Strv(int food) {
        switch(food) {
            case 1: //밥
                if (happy < max_happy) {
                    happy += 10;
                    if (happy > max_happy) {
                        happy = max_happy;
                    }
                }
                if (hp < max_hp) {
                    hp += 15;
                    if (hp > max_hp) {
                        hp = max_hp;
                    }
                }
                if (sp < max_sp) {
                    sp += 15;
                    if (sp > max_sp) {
                        sp = max_sp;
                    }
                }
                break;


            case 2: //간식

                if (happy < max_happy) {
                    happy += 5;
                    if (happy > max_happy) {
                        happy = max_happy;
                    }
                }
                if (hp < max_hp) {
                    hp += 5;
                    if (hp > max_hp) {
                        hp = max_hp;
                    }
                }
                if (sp < max_sp) {
                    sp += 5;
                    if (sp > max_sp) {
                        sp = max_sp;
                    }
                }
                break;

            case 3: //특식

                if (happy < max_happy) {
                    happy += 20;
                    if (happy > max_happy) {
                        happy = max_happy;
                    }
                }
                if (hp < max_hp) {
                    hp += 20;
                    if (hp > max_hp) {
                        hp = max_hp;
                    }
                }
                if (sp < max_sp) {
                    sp += 20;
                    if (sp > max_sp) {
                        sp = max_sp;
                    }
                }
                break;

        }
    }

    public void status(){
        System.out.println("hp: "+hp+"\n" +
                " sp: "+sp+"\n"+
                " loneliness: "+loneliness+"\n"+
                " happy: "+happy+"\n"+
                " starve: "+starve+"\n"+
                " max_hp: "+max_hp+"\n"+
                " max_sp: "+max_sp+"\n"+
                " max_loneliness: "+max_loneliness+"\n"+
                " max_happy: "+max_happy+"\n"+
                " max_starve: "+max_starve+"\n"
                );
        if(hp<30){
            System.out.println("너무 아파요~");
        }
        if(sp<30){
            System.out.println("너무 지쳐요~");
        }
        if(loneliness<30){
            System.out.println("너무 외로워요~");
        }
        if(happy<30){
            System.out.println("너무 슬퍼요~");
        }
        if(starve<30){
            System.out.println("너무 배고파요~");
        }
    }

    public void nowStatus(){
        if(hp<30){
            System.out.println("너무 아파요~");
        }
        if(sp<30){
            System.out.println("너무 지쳐요~");
        }
        if(loneliness<30){
            System.out.println("너무 외로워요~");
        }
        if(happy<30){
            System.out.println("너무 슬퍼요~");
        }
        if(starve<30){
            System.out.println("너무 배고파요~");
        }
    }
}
