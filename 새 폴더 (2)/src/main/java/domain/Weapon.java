package domain;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Weapon {
    private Long lv;
    private int atk;
    private int def;
    private int gold;


    public Weapon() {}

    @Builder
    public Weapon(Long lv,int atk, int def, int gold) {
        this.lv = lv;
        this.atk = atk;
        this.def = def;
        this.gold = gold;
    }
}
