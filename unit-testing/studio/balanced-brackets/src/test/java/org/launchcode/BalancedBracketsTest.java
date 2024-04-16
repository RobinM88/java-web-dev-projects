package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void testNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[un]chCo[de]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]La[u]n[ch]Co[de]"));
    }

    @Test
    public void testBalancedBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testBalancedBracketsWithinString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBalancedBracketsAtStart() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testEmptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testUnbalancedOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnbalancedClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }
}
