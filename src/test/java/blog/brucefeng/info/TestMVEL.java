package blog.brucefeng.info;


import java.util.*;
import org.mvel2.MVEL;

/**
 * @author Zilvinas Vilutis
 * @since 6.1
 *
 */
public class TestMVEL {

  /**
   * Test method for {@link org.mvel2.MVEL#eval(String, Map)}.
   */

  public static void main(String[] args) {

    final String expression = "{'cfe43191-1a81-38ef-9f3c-245bff7d37ac','6135fe8c-1ba9-4360-beab-e53691b020ad-wrong'} contains SOMESTRING";

    final Map<String, String> params = new HashMap<String, String>();
    params.put( "SOMESTRING", "cfe43191-1a81-38ef-9f3c-245bff7d37ac" );
    System.out.println( MVEL.eval( expression, params ) );

    params.put( "SOMESTRING", "6135fe8c-1ba9-4360-beab-e53691b020ad" );
    System.out.println( MVEL.eval( expression, params ) );

  }

}