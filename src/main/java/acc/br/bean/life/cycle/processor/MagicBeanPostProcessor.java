package acc.br.bean.life.cycle.processor;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;
import org.springframework.beans.factory.config.BeanPostProcessor;

import acc.br.bean.life.cycle.beans.Character;

public class MagicBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("5. BeanPostProcessor: Adding a touch of magic to " + ((Character) bean).getName());
        } else if (bean instanceof Item) {
            System.out.println("5. BeanPostProcessor: Adding a touch of magic to item " + ((Item) bean).getName());
        } else if (bean instanceof Weapon) {
            System.out.println("5. BeanPostProcessor: Adding a touch of magic to weapon " + ((Weapon) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("9. BeanPostProcessor: Magic continues for " + ((Character) bean).getName());
        } else if (bean instanceof Item) {
            System.out.println("9. BeanPostProcessor: Magic continues for item " + ((Item) bean).getName());
        } else if (bean instanceof Weapon) {
            System.out.println("9. BeanPostProcessor: Magic continues for weapon " + ((Weapon) bean).getName());
        }
        return bean;
    }
}
