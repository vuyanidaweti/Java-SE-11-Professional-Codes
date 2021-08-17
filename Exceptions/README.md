***Exception Handling***

There three types of Wception Handling 
	1. Checked Exceptions -> Checked on complile- time.
	2. Unchecked Exceptions ->They are checked on runtime.
	3. Error -> These are caught by the JVM during runtime.

All exception classes are subclass of java.lang.Throwable
    Throwable  -> Exception 
    				-> IOException (Input/Output Streams )
    				-> SQLException (Database queries)
    				-> ClassNotFoundException (Class Declararion and object calling )
    				-> RuntimeException 
    					-> ArithmenticException (Numeric Exceptions like dividing by zero)
    					-> NullPointerException (This is using Object methods on a null object)
    					-> NumberFormatException (Incorrent formatting of a number (e.g casting a string to number))
    					-> IndexOutOfBoundsException
    							-> ArrayIndexOutOfBoundsException
    							-> StringIndexOutOfBoundsException
    		   -> Errors
    		   		->StackOVerFlowError
    		   		->VirtualMachineError
    		   		-> OutOfMemoryError
  					->AssertionError