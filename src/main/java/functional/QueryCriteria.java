package functional;

@FunctionalInterface
public interface QueryCriteria {

    boolean isMatch(Employee employee);
}
