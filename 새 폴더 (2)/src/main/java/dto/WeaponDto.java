package dto;

import domain.Weapon;

import lombok.Builder;
import lombok.Data;


@Data
public class WeaponDto {
    private Long lv;
    private int atk;
    private int def;
    private int gold;

    public WeaponDto() {}

    @Builder
    public WeaponDto(Weapon weapon) {
        this.lv = weapon.getLv();
        this.atk = weapon.getAtk();
        this.def = weapon.getDef();
        this.gold = weapon.getGold();

    }

    @Builder
    public Weapon toEntity_sword() {
        return Weapon.builder()
                .lv(lv)
                .atk(atk)
                .gold(gold)
                .build();
    }
    @Builder
    public Weapon toEntity_armor() {
        return Weapon.builder()
                .lv(lv)
                .def(def)
                .gold(gold)
                .build();
    }
}

