package codes.yam.leetcode.palindromenumber;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
public class SolutionBenchmark {
    private final Solution solution = new Solution();

    @SuppressWarnings("unused") // assigned by JMH via reflection
    @Param({"7", "121", "1234321", "2147483647"})
    private int input;

    @Benchmark
    public boolean isPalindrome() {
        return solution.isPalindrome(input);
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(SolutionBenchmark.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }
}
