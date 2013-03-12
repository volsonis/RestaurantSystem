package db.wrapper ;

import java.util.Map ;
import java.util.HashMap ;
import java.sql.Connection ;
import java.sql.SQLException ;
import com.javaranch.common.Str ;
import com.javaranch.db.DBResults ;
import com.javaranch.db.TableFacade ;

/** Strongly typed access to the database table "pendingorders".
 *
 * This source file was automatically generated by "Jenny the db code generator"
 * based on information found in the database.  Do not modify this file!
 *
 * For more information on Jenny, see http://www.javaranch.com/jenny.jsp
 *
 *
 * Most of the methods are static so you don't need to instantiate a copy of this class 
 * to do your work.  The primary access methods are:
 * <ul>
 *
 *     <b>getRow()/getRows()/getAllRows()</b><br>
 *     <b>search() </b><i>like getRows(), but you can specify which columns you want back</i><br>
 *     <b>update()</b><br>
 *     <b>delete()</b><br>
 *     <b>insert()</b><br>
 *
 * </ul>
 *
 * These methods all have the option of passing in a connection as the first parameter.
 * Usually you won't use a connection directly, but sometimes it's useful.
 *
 * The getRows() methods all return an array of Row objects or a single Row object.  The
 * row object is easy to work with and provides strong type checking.  If your table has
 * a lot of columns, and your search will return a lot of rows, you might want to consider
 * using a search() method instead.  You lose some of your strong type checking, but 
 * you might go a lot easier on memory.  In these cases, you will want to make sure you
 * use the column name constants found at the top of this class.
 *
 */
public class PendingordersTable
{

    private static Implementation imp = new Implementation();

    public static final String tableName = "pendingorders";

    public static final String numberColumnName = "number";
    public static final String valueColumnName = "value";
    public static final String notesColumnName = "notes";
    public static final String customer_idColumnName = "customer_id";
    public static final String tablenumberColumnName = "tablenumber";
    public static final String discount_idColumnName = "discount_id";

    private static String[] allColumns =
    {
        numberColumnName , valueColumnName , notesColumnName , customer_idColumnName , tablenumberColumnName , discount_idColumnName , 
    };

    /** You probably want to use the static methods for most of your access, but once in a while you might need to
     *  pass an instance object to a method that knows how to work with these sorts of tables.
     */
    public static Implementation getInstance()
    {
        return imp ;
    }

    /** For use by unit testing, although you could provide your own implementation here if
     *  you wanted to.
     *  
     *  To use this in your unit testing, create an instance of MockPendingordersTable and pass
     *  it in here.  Then set your mock return values, call the method you are testing and examine
     *  the mock values that are now set!
     */
    public static void setInstance( PendingordersTable.Implementation instance  )
    {
        imp = instance ;
    }

    /** Exposed for unit testing purposes only! */
    static class Implementation extends TableFacade
    {

        /** Exposed for unit testing purposes only! */
        Implementation()
        {
            super( ProjectFacade.getInstance() , tableName );
        }

        // convert a DBResults object to an array of Row objects.
        // requires that all of the columns be represented in the DBResults object and in the right order
        private static Row[] rowArray( DBResults r )
        {
            Row[] rows = new Row[ r.size() ];
            for( int i = 0 ; i < rows.length ; i++ )
            {
                rows[ i ] = new Row( r.getRow( i ) );
            }
            return rows ;
        }

        /** Instantiate an empty Row object */
        public Row getRow()
        {
            // if you are wondering about why this method is so lame - it's for unit testing!
            // The idea is that during unit testing, a different test object will be returned here.
            // To learn more about unit testing with Jenny generated code, visit <a href="http://www.javaranch.com/jenny.jsp">www.javaranch.com/jenny.jsp</a>
            return new Row();
        }

        /** Instantiate a Row object and fill its content based on a search
         *
         * Return null if not found.
         */
        public Row getRow( Connection con , String column , String searchText ) throws SQLException
        {
            Row row = new Row( this.search( con , column , searchText , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Instantiate a Row object and fill its content based on a search
         *
         * Return null if not found.
         */
        public Row getRow( String column , String searchText ) throws SQLException
        {
            Row row = new Row( this.search( column , searchText , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String column , String searchText ) throws SQLException
        {
            return rowArray( this.search( con , column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String column , String searchText ) throws SQLException
        {
            return rowArray( this.search( column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String column , String[] searchText ) throws SQLException
        {
            return rowArray( this.search( con , column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String column , String[] searchText ) throws SQLException
        {
            return rowArray( this.search( column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String whereClause ) throws SQLException
        {
            return rowArray( this.search( con , whereClause , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String whereClause ) throws SQLException
        {
            return rowArray( this.search( whereClause , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getAllRows( Connection con ) throws SQLException
        {
            return rowArray( this.search( con , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getAllRows() throws SQLException
        {
            return rowArray( this.search( allColumns ) );
        }


    }

    public static class Row
    {

        private boolean dataLoadedFromDatabase = false ;

        private int number ;
        private double value ;
        private boolean valueNull = true ;
        private String notes ;
        private int customer_id ;
        private boolean customer_idNull = true ;
        private int tablenumber ;
        private boolean tablenumberNull = true ;
        private int discount_id ;
        private boolean discount_idNull = true ;

        /** for internal use only!   If you need a row object, use getRow(). */
        Row()
        {
        }

        private Row( String[] data )
        {
            if ( data != null )
            {
                this.number =  Str.toInt( data[0] );
                this.valueNull = ( data[1] == null );
                this.value = valueNull ? 0.0 : Str.toDouble( data[1] );
                this.notes = data[2];
                this.customer_idNull = ( data[3] == null );
                this.customer_id = customer_idNull ? 0 : Str.toInt( data[3] );
                this.tablenumberNull = ( data[4] == null );
                this.tablenumber = tablenumberNull ? 0 : Str.toInt( data[4] );
                this.discount_idNull = ( data[5] == null );
                this.discount_id = discount_idNull ? 0 : Str.toInt( data[5] );
                dataLoadedFromDatabase = true ;
            }
        }

        private Row( DBResults results )
        {
            this( results.getRow(0) );
        }

        public int getNumber()
        {
            return number ;
        }

        public void setNumber( int number )
        {
            this.number = number ;
        }


        public double getValue()
        {
            return value ;
        }

        public void setValue( double value )
        {
            this.value = value ;
            valueNull = false ;
        }

        public void setValue( Double value )
        {
            valueNull = ( value == null );
            if ( valueNull )
            {
                this.value = 0.0 ;
            }
            else
            {
                this.value = value.doubleValue() ;
            }
        }

        public boolean isValueNull()
        {
            return valueNull ;
        }

        public void setValueNull( boolean valueNull )
        {
            this.valueNull = valueNull ;
            if ( valueNull )
            {
                value = 0.0 ;
            }
        }


        public String getNotes()
        {
            return notes ;
        }

        public void setNotes( String notes )
        {
            this.notes = notes ;
        }


        public int getCustomer_id()
        {
            return customer_id ;
        }

        public void setCustomer_id( int customer_id )
        {
            this.customer_id = customer_id ;
            customer_idNull = false ;
        }

        public void setCustomer_id( Integer customer_id )
        {
            customer_idNull = ( customer_id == null );
            if ( customer_idNull )
            {
                this.customer_id = 0 ;
            }
            else
            {
                this.customer_id = customer_id.intValue() ;
            }
        }

        public boolean isCustomer_idNull()
        {
            return customer_idNull ;
        }

        public void setCustomer_idNull( boolean customer_idNull )
        {
            this.customer_idNull = customer_idNull ;
            if ( customer_idNull )
            {
                customer_id = 0 ;
            }
        }


        public int getTablenumber()
        {
            return tablenumber ;
        }

        public void setTablenumber( int tablenumber )
        {
            this.tablenumber = tablenumber ;
            tablenumberNull = false ;
        }

        public void setTablenumber( Integer tablenumber )
        {
            tablenumberNull = ( tablenumber == null );
            if ( tablenumberNull )
            {
                this.tablenumber = 0 ;
            }
            else
            {
                this.tablenumber = tablenumber.intValue() ;
            }
        }

        public boolean isTablenumberNull()
        {
            return tablenumberNull ;
        }

        public void setTablenumberNull( boolean tablenumberNull )
        {
            this.tablenumberNull = tablenumberNull ;
            if ( tablenumberNull )
            {
                tablenumber = 0 ;
            }
        }


        public int getDiscount_id()
        {
            return discount_id ;
        }

        public void setDiscount_id( int discount_id )
        {
            this.discount_id = discount_id ;
            discount_idNull = false ;
        }

        public void setDiscount_id( Integer discount_id )
        {
            discount_idNull = ( discount_id == null );
            if ( discount_idNull )
            {
                this.discount_id = 0 ;
            }
            else
            {
                this.discount_id = discount_id.intValue() ;
            }
        }

        public boolean isDiscount_idNull()
        {
            return discount_idNull ;
        }

        public void setDiscount_idNull( boolean discount_idNull )
        {
            this.discount_idNull = discount_idNull ;
            if ( discount_idNull )
            {
                discount_id = 0 ;
            }
        }



        
        private boolean dataLoadedFromDatabase()
        {
            return dataLoadedFromDatabase ;
        }

        private Map buildDataMap()
        {
            Map data = new HashMap();
            data.put( numberColumnName , String.valueOf(  this.number ) );
            data.put( valueColumnName , this.valueNull ? null : String.valueOf( this.value ) );
            data.put( notesColumnName , this.notes );
            data.put( customer_idColumnName , this.customer_idNull ? null : String.valueOf( this.customer_id ) );
            data.put( tablenumberColumnName , this.tablenumberNull ? null : String.valueOf( this.tablenumber ) );
            data.put( discount_idColumnName , this.discount_idNull ? null : String.valueOf( this.discount_id ) );
            return data ;
        }

        /** update a row object based on a search */
        public void update( Connection con , String column , String searchText ) throws SQLException
        {
            imp.update( con , column , searchText , buildDataMap() );
        }

        /** update a row object based on a search */
        public void update( String column , String searchText ) throws SQLException
        {
            imp.update( column , searchText , buildDataMap() );
        }

        /** create a new row.*/
        public void insert( Connection con ) throws SQLException
        {
            imp.insert( con , buildDataMap() );
        }

        /** create a new row.*/
        public void insert() throws SQLException
        {
            imp.insert( buildDataMap() );
        }


    }

    /** Return an empty row object */
    public static Row getRow()
    {
        return imp.getRow();
    }

    /** Instantiate a Row object and fill its content based on a search
     *
     * Return null if not found.
     */
    public static Row getRow( Connection con , String column , String searchText ) throws SQLException
    {
        return imp.getRow( con , column , searchText );
    }

    /** Instantiate a Row object and fill its content based on a search
     *
     * Return null if not found.
     */
    public static Row getRow( String column , String searchText ) throws SQLException
    {
        return imp.getRow( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , String searchText ) throws SQLException
    {
        return imp.getRows( con , column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , String searchText ) throws SQLException
    {
        return imp.getRows( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , String[] searchText ) throws SQLException
    {
        return imp.getRows( con , column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , String[] searchText ) throws SQLException
    {
        return imp.getRows( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , int searchValue ) throws SQLException
    {
        return imp.getRows( con , column , String.valueOf( searchValue ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , int searchValue ) throws SQLException
    {
        return imp.getRows( column , String.valueOf( searchValue ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , int[] searchValues ) throws SQLException
    {
        return imp.getRows( con , column , Str.toStringArray( searchValues ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , int[] searchValues ) throws SQLException
    {
        return imp.getRows( column , Str.toStringArray( searchValues ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String whereClause ) throws SQLException
    {
        return imp.getRows( con , whereClause );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String whereClause ) throws SQLException
    {
        return imp.getRows( whereClause );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getAllRows( Connection con ) throws SQLException
    {
        return imp.getAllRows( con );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getAllRows() throws SQLException
    {
        return imp.getAllRows();
    }

    public static DBResults search( Connection con , String column , String searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchText , dataColumns );
    }

    public static DBResults search( String column , String searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchText , dataColumns );
    }

    public static DBResults search( Connection con , String column , String[] searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchText , dataColumns );
    }

    public static DBResults search( String column , String searchText[] , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchText , dataColumns );
    }

    public static DBResults search( Connection con , String column , int searchValue , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchValue , dataColumns );
    }

    public static DBResults search( String column , int searchValue , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchValue , dataColumns );
    }

    public static DBResults search( Connection con , String column , int[] searchValues , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchValues , dataColumns );
    }

    public static DBResults search( String column , int[] searchValues , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchValues , dataColumns );
    }

    public static DBResults search( Connection con , String whereClause , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , whereClause , dataColumns );
    }

    public static DBResults search( String whereClause , String[] dataColumns ) throws SQLException
    {
        return imp.search( whereClause , dataColumns );
    }

    public static DBResults search( Connection con , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , dataColumns );
    }

    public static DBResults search( String[] dataColumns ) throws SQLException
    {
        return imp.search( dataColumns );
    }

    public static void update( Connection con , String column , String searchText , Map data ) throws SQLException
    {
        imp.update( con , column , searchText , data );
    }

    public static void update( String column , String searchText , Map data ) throws SQLException
    {
        imp.update( column , searchText , data );
    }

    public static void delete( Connection con , String column , String searchText ) throws SQLException
    {
        imp.delete( con , column , searchText );
    }

    public static void delete( String column , String searchText ) throws SQLException
    {
        imp.delete( column , searchText );
    }

    public static void insert( Connection con , Map data ) throws SQLException
    {
        imp.insert( con , data );
    }

    public static void insert( Map data ) throws SQLException
    {
        imp.insert( data );
    }



}
