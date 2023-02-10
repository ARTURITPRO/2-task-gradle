package utils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
 public static boolean  isPositiveNumber(String str){
      int nul = 0;
      if (!NumberUtils.isParsable (str)) {
          throw new IllegalArgumentException("The number must be <Integer>");
      }
      int i = Integer.parseInt(str);
     return NumberUtils.compare(i, nul) > nul;
 }
}
