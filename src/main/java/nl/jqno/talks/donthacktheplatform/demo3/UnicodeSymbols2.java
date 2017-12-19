package nl.jqno.talks.donthacktheplatform.demo3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicodeSymbols2 {

    private static int Z̗̹͎͚̊̈͋̄͆͆̒͠Á̳̞̻͚̌̃ͪ̈́͋̾͝L͙͔̼̗̭͖̇̔͊͛ͪ͠G̲̦̭̘͕̍ͫͨ̌̀ͤͬ̐͟Ô͕͓͍̓͢ = -1;

    @Test
    public void he_is_coming() {
        assertEquals(-1, Z̗̹͎͚̊̈͋̄͆͆̒͠Á̳̞̻͚̌̃ͪ̈́͋̾͝L͙͔̼̗̭͖̇̔͊͛ͪ͠G̲̦̭̘͕̍ͫͨ̌̀ͤͬ̐͟Ô͕͓͍̓͢);
    }

    @Test
    public void he_is_upon_us() throws Exception {
        String fieldName = getClass().getDeclaredField("Z̗̹͎͚̊̈͋̄͆͆̒͠Á̳̞̻͚̌̃ͪ̈́͋̾͝L͙͔̼̗̭͖̇̔͊͛ͪ͠G̲̦̭̘͕̍ͫͨ̌̀ͤͬ̐͟Ô͕͓͍̓͢").getName();
        assertEquals("Z̗̹͎͚̊̈͋̄͆͆̒͠Á̳̞̻͚̌̃ͪ̈́͋̾͝L͙͔̼̗̭͖̇̔͊͛ͪ͠G̲̦̭̘͕̍ͫͨ̌̀ͤͬ̐͟Ô͕͓͍̓͢", fieldName);
    }
}
