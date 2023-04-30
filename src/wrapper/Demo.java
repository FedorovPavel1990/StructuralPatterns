package wrapper;

import wrapper.notifierwrapper.EmailNotifierWrapper;
import wrapper.notifierwrapper.SMSNotifierWrapper;
import wrapper.notifierwrapper.TiMeNotifierWrapper;

public class Demo {

    public static void main(String[] args) {
        // Был некий базовый оповещатель
        String message = "Очень важное сообщение!";
        Notifier notifier = new Notifier();
        notifier.send(message);

        // Возникла необходимость расширить его функциональность, для этого делаем NotifierWrapper
        Notifier smsNotifier = new SMSNotifierWrapper(notifier, "+79991234567");
        Notifier emailNotifier = new EmailNotifierWrapper(notifier, "abc@abcdef.ru");
        Notifier tiMeNotifier = new TiMeNotifierWrapper(notifier, "i.ivanov");
        smsNotifier.send(message);
        emailNotifier.send(message);
        tiMeNotifier.send(message);

        Notifier emailSmsTiMeNotifier = new SMSNotifierWrapper(
                new EmailNotifierWrapper(
                        new TiMeNotifierWrapper(notifier,
                                "p.petrov"),
                        "iiii@abcdef.ru"),
                "+79991112233");
        emailSmsTiMeNotifier.send(message);
    }

//    Результат работы:
//
//    Отправляю сообщение: Очень важное сообщение!
//    Отправляю сообщение: Очень важное сообщение!
//    Отправляю SMS-сообщение на номер +79991234567: Очень важное сообщение!
//    Отправляю сообщение: Очень важное сообщение!
//    Отправляю email-сообщение на почту abc@abcdef.ru: Очень важное сообщение!
//    Отправляю сообщение: Очень важное сообщение!
//    Отправляю сообщение в Slack пользователю i.ivanov: Очень важное сообщение!
//    Отправляю сообщение: Очень важное сообщение!
//    Отправляю сообщение в Slack пользователю p.petrov: Очень важное сообщение!
//    Отправляю email-сообщение на почту iiii@abcdef.ru: Очень важное сообщение!
//    Отправляю SMS-сообщение на номер +79991112233: Очень важное сообщение!

}
