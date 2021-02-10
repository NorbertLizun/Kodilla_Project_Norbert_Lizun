package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User kuba = new Millenials("Kuba");
        User kamil = new YGeneration("Kamil");
        User adam = new ZGeneration("Adam");

        //When
        String kubaDefaultSharing = kuba.sharePost();
        System.out.println("Kuba shares posts on " + kubaDefaultSharing);
        String kamilDefaultSharing = kamil.sharePost();
        System.out.println("Kamil shares posts on " + kamilDefaultSharing);
        String adamDefaultSharing = adam.sharePost();
        System.out.println("Adam shares posts on " + adamDefaultSharing);

        //Then
        assertEquals("Twitter", kubaDefaultSharing);
        assertEquals("Facebook", kamilDefaultSharing);
        assertEquals("Snapchat", adamDefaultSharing);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User kuba = new Millenials("Kuba");

        //When
        String kubaDefaultSharing = kuba.sharePost();
        System.out.println("Kuba shares posts on " + kubaDefaultSharing);
        kuba.setSocialPublisher(new SnapchatPublisher());
        kubaDefaultSharing = kuba.sharePost();
        System.out.println("Kuba shares posts on " + kubaDefaultSharing);

        //Then
        assertEquals("Snapchat", kubaDefaultSharing);


    }
}
