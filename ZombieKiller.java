import java.util.Scanner;

public class ZombieKiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入僵尸的血量: ");
        int n = scanner.nextInt();

        int totalAttacks = 0;

        // 每3次攻击造成的总伤害
        int damagePerSet = 16; // 3 * 2 + 10
        // 每次攻击造成的伤害
        int normalDamage = 2;

        // 计算完整的3次攻击组数
        int sets = n / damagePerSet;
        totalAttacks += sets * 3;

        // 剩余血量
        int remainingHealth = n - sets * damagePerSet;

        // 处理剩余血量
        if (remainingHealth > 0) {
            if (remainingHealth <= 6) {
                totalAttacks += (remainingHealth + 1) / 2; // 向上取整
            } else {
                totalAttacks += 3; // 需要3次攻击
            }
        }

        System.out.println("砍死僵尸所需的总次数: " + totalAttacks);
    }
}
