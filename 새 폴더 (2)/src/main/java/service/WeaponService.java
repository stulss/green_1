package service;



import repository.WeaponRepository;
import domain.Weapon;
import dto.WeaponDto;

import java.util.List;

// ** 요구사항 분석에 의한 각종 기능들을 포함 및 실행되는 곳.
public class WeaponService {

    private WeaponRepository weaponRepository = null;

    public WeaponService(){
        weaponRepository = new WeaponRepository();
        weaponRepository.createSwordTable();
        weaponRepository.createArmorTable();
    }

    public void save_sword(WeaponDto weaponDto) {
        if(weaponRepository.)
        weaponRepository.save_sword(weaponDto.toEntity_sword());
    }
    public void save_armor(WeaponDto weaponDto) {
                weaponRepository.save_armor(weaponDto.toEntity_armor());
    }



    public List<Weapon> findSwordLv(String name) {
        return WeaponRepository.findByName(name);
    }

    public void changeName(String email,String name){
        User user = userRepository.findByEmail(email);
        userRepository.save(name, email);
    }


    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }
}

