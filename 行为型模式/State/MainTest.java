package State;

public class MainTest {
    //状态模式  与策略模式结构相似 处理的问题不同
    /**
     * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为
     *
     * 结构：
     * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
     * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
     * 具体状态（ConcreteState）角色：实现抽象状态所对应的行为
     *
     * 优点：
     * - 状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”。
     * - 减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖。
     * - 有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换
     * 缺点：
     * - 状态模式的使用必然会增加系统的类与对象的个数。
     * - 状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱
     * 应用场景：
     * - 代码中包含大量与对象状态有关的条件语句。
     * - 对象的行为依赖着状态，并且行为随着状态的改变而改变
     */
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
