package test;

import java.math.BigInteger;
import java.util.Optional;

public class CompilerBug {

  public static final Optional<BigInteger> oi = Optional.of(BigInteger.TEN).flatMap(i -> {
    Optional<BigInteger> one =  Optional.of(BigInteger.valueOf(1L));
    return Optional.of(BigInteger.valueOf(2L)).or(() -> one.map(i::subtract));
  });

}
