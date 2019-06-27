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

    final String expression = "{ 'firstName', 'middleName', 'lastName' } contains SOMESTRING";

    final Map<String, String> params = new HashMap<String, String>();
    params.put( "SOMESTRING", "firstName" );
    System.out.println( MVEL.eval( expression, params ) );

    params.put( "SOMESTRING", "first" );
    System.out.println( MVEL.eval( expression, params ) );

    params.put( "SOMESTRING", "address" );
    System.out.println( MVEL.eval( expression, params ) );
  }

}