package com.kodilla.good.patterns.challenges;

public class SendInfoMail implements InformationService {

    @Override
    public void sendMail(User user, Item item) {
        System.out.println("Message to user - Hello " + user.getFirstName() + " You just bought " + item.getItemName() + "! Thank you for using our services.....");
    }
}
