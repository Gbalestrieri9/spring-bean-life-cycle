package acc.br.bean.life.cycle.config;

import acc.br.bean.life.cycle.beans.Character;
import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CharacterConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Character character() {
        return new Character();
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Weapon sword() {
        return new Weapon("Sword");
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Item potion() {
        return new Item("Health Potion");
    }

    @Bean
    public MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }
}
