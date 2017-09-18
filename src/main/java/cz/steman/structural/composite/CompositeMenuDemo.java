package cz.steman.structural.composite;

public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenuItem = new MenuItem("Personal Claim", "/personalClaim");
        claimsSubMenu.add(personalClaimsMenuItem);

        System.out.println(mainMenu);

    }
}
