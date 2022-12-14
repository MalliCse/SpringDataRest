package configuration

ruleset {
	// rulesets/basic
	AssertWithinFinallyBlock
	AssignmentInConditional
	BigDecimalInstantiation
	BitwiseOperatorInConditional
	BooleanGetBoolean
	BrokenNullCheck
	BrokenOddnessCheck
	ClassForName
	ComparisonOfTwoConstants
	ComparisonWithSelf
	ConstantAssertExpression
	ConstantIfExpression
	ConstantTernaryExpression
	DeadCode
	DoubleNegative
	DuplicateCaseStatement
	DuplicateMapKey
	DuplicateSetValue
	EmptyCatchBlock
	EmptyClass
	EmptyElseBlock
	EmptyFinallyBlock
	EmptyForStatement
	EmptyIfStatement
	EmptyInstanceInitializer
	EmptyStaticInitializer
	EmptySwitchStatement
	EmptySynchronizedStatement
	EmptyTryBlock
	EmptyWhileStatement
	EqualsAndHashCode
	EqualsOverloaded
	ExplicitGarbageCollection
	ForLoopShouldBeWhileLoop
	HardCodedWindowsFileSeparator
	HardCodedWindowsRootDirectory
	IntegerGetInteger
	MultipleUnaryOperators
	RandomDoubleCoercedToZero
	RemoveAllOnSelf
	ReturnFromFinallyBlock
	ThrowExceptionFromFinallyBlock
	// rulesets/braces
	ElseBlockBraces
	ForStatementBraces
	IfStatementBraces
	WhileStatementBraces
	// rulesets/concurrency.xml
	BusyWait
	DoubleCheckedLocking
	InconsistentPropertyLocking
	InconsistentPropertySynchronization
	NestedSynchronization
	StaticCalendarField
	StaticConnection
	StaticDateFormatField
	StaticMatcherField
	StaticSimpleDateFormatField
	SynchronizedMethod
	SynchronizedOnBoxedPrimitive
	SynchronizedOnGetClass
	SynchronizedOnReentrantLock
	SynchronizedOnString
	SynchronizedOnThis
	SynchronizedReadObjectMethod
	SystemRunFinalizersOnExit
	ThisReferenceEscapesConstructor
	ThreadGroup
	ThreadLocalNotStaticFinal
	ThreadYield
	UseOfNotifyMethod
	VolatileArrayField
	VolatileLongOrDoubleField
	WaitOutsideOfWhileLoop
	// rulesets/convention
	ConfusingTernary
	// CouldBeElvis
	HashtableIsObsolete
	IfStatementCouldBeTernary
	InvertedIfElse
	LongLiteralWithLowerCaseL
	NoDef
	ParameterReassignment
	TernaryCouldBeElvis
	VectorIsObsolete
	// rulesets/design.xml
	AbstractClassWithPublicConstructor
	AbstractClassWithoutAbstractMethod
	BooleanMethodReturnsNull
	// BuilderMethodWithSideEffects
	CloneableWithoutClone
	CloseWithoutCloseable
	CompareToWithoutComparable
	ConstantsOnlyInterface
	EmptyMethodInAbstractClass
	FinalClassWithProtectedMember
	ImplementationAsType
	Instanceof
	LocaleSetDefault
	NestedForLoop
	PrivateFieldCouldBeFinal
	PublicInstanceField
	ReturnsNullInsteadOfEmptyArray
	ReturnsNullInsteadOfEmptyCollection
	SimpleDateFormatMissingLocale
	StatelessSingleton
	ToStringReturnsNull
	// rulesets/dry
	/*
	DuplicateListLiteral
	DuplicateMapLiteral
	DuplicateNumberLiteral
	DuplicateStringLiteral
	*/
	// rulesets/enhanced.xml
	/*
	CloneWithoutCloneable
	JUnitAssertEqualsConstantActualValue
	UnsafeImplementationAsMap
	*/
	// rulesets/exceptions
	CatchArrayIndexOutOfBoundsException
	CatchError
	CatchException
	CatchIllegalMonitorStateException
	CatchIndexOutOfBoundsException
	CatchNullPointerException
	CatchRuntimeException
	CatchThrowable
	ConfusingClassNamedException
	ExceptionExtendsError
	ExceptionExtendsThrowable
	ExceptionNotThrown
	MissingNewInThrowStatement
	ReturnNullFromCatchBlock
	SwallowThreadDeath
	ThrowError
	ThrowException
	ThrowRuntimeException
	ThrowThrowable
	// rulesets/formatting
	BlankLineBeforePackage
	BracesForClass
	BracesForForLoop
	BracesForIfElse
	BracesForMethod
	BracesForTryCatchFinally
//    ClassJavadoc
	ClosureStatementOnOpeningLineOfMultipleLineClosure
	ConsecutiveBlankLines
	FileEndsWithoutNewline
	LineLength
	MissingBlankLineAfterImports
	MissingBlankLineAfterPackage
	SpaceAfterCatch
	SpaceAfterClosingBrace
	SpaceAfterComma
	SpaceAfterFor
	SpaceAfterIf
	SpaceAfterOpeningBrace
	SpaceAfterSemicolon
	SpaceAfterSwitch
	SpaceAfterWhile
	SpaceAroundClosureArrow
	SpaceAroundMapEntryColon(characterAfterColonRegex: /\s/)
	SpaceAroundOperator
	SpaceBeforeClosingBrace
	SpaceBeforeOpeningBrace
	TrailingWhitespace
	// rulesets/generic.xml
	IllegalClassMember
	IllegalClassReference
	IllegalPackageReference
	IllegalRegex
	IllegalString
	RequiredRegex
	RequiredString
	StatelessClass
	// rulesets/groovyism
	/*AssignCollectionSort
	AssignCollectionUnique
	ClosureAsLastMethodParameter
	CollectAllIsDeprecated
	ConfusingMultipleReturns
	ExplicitArrayListInstantiation
	ExplicitCallToAndMethod
	ExplicitCallToCompareToMethod
	ExplicitCallToDivMethod
	ExplicitCallToEqualsMethod
	ExplicitCallToGetAtMethod
	ExplicitCallToLeftShiftMethod
	ExplicitCallToMinusMethod
	ExplicitCallToModMethod
	ExplicitCallToMultiplyMethod
	ExplicitCallToOrMethod
	ExplicitCallToPlusMethod
	ExplicitCallToPowerMethod
	ExplicitCallToRightShiftMethod
	ExplicitCallToXorMethod
	ExplicitHashMapInstantiation
	ExplicitHashSetInstantiation
	ExplicitLinkedHashMapInstantiation
	ExplicitLinkedListInstantiation
	ExplicitStackInstantiation
	ExplicitTreeSetInstantiation
	GStringAsMapKey
	GStringExpressionWithinString
	GetterMethodCouldBeProperty
	GroovyLangImmutable
	UseCollectMany
	UseCollectNested*/
	// rulesets/imports
	DuplicateImport
	ImportFromSamePackage
	ImportFromSunPackages
	MisorderedStaticImports
	UnnecessaryGroovyImport
	UnusedImport
	NoWildcardImports
	// rulesets/jdbc
	DirectConnectionManagement
	JdbcConnectionReference
	JdbcResultSetReference
	JdbcStatementReference
	// rulesets/junit.xml
//    ChainedTest
//    CoupledTestCase
//    JUnitAssertAlwaysFails
//    JUnitAssertAlwaysSucceeds
//    JUnitFailWithoutMessage
//    JUnitLostTest
//    JUnitPublicField
//    JUnitPublicNonTestMethod
//    JUnitPublicProperty
//    JUnitSetUpCallsSuper
//    JUnitStyleAssertions
//    JUnitTearDownCallsSuper
//    JUnitTestMethodWithoutAssert
//    JUnitUnnecessarySetUp
//    JUnitUnnecessaryTearDown
//    JUnitUnnecessaryThrowsException
//    SpockIgnoreRestUsed
//    UnnecessaryFail
//    UseAssertEqualsInsteadOfAssertTrue
//    UseAssertFalseInsteadOfNegation
//    UseAssertNullInsteadOfAssertEquals
//    UseAssertSameInsteadOfAssertTrue
//    UseAssertTrueInsteadOfAssertEquals
//    UseAssertTrueInsteadOfNegation
	// rulesets/logging.xml
	LoggerForDifferentClass
	LoggerWithWrongModifiers
	LoggingSwallowsStacktrace
	MultipleLoggers
	PrintStackTrace
	Println
	SystemErrPrint
	SystemOutPrint
	// rulesets/naming.xml
	AbstractClassName
	ClassName {
		regex = '^[A-Z][\\$a-zA-Z0-9]*$'
	}
	ClassNameSameAsFilename
	ConfusingMethodName
	// FactoryMethodName
	FieldName {
		regex = '^_?[a-z][a-zA-Z0-9]*$'
		finalRegex = '^_?[a-z][a-zA-Z0-9]*$'
		staticFinalRegex = '^logger$|^[A-Z][A-Z_0-9]*$|^serialVersionUID$'
	}
	InterfaceName
	MethodName {
		regex = '^[a-z][\\$_a-zA-Z0-9]*$|^.*\\s.*$'
	}
	ObjectOverrideMisspelledMethodName
	PackageName
	ParameterName
	PropertyName
	VariableName {
		finalRegex = '^[a-z][a-zA-Z0-9]*$'
	}
	// rulesets/security.xml
	FileCreateTempFile
	InsecureRandom
//    JavaIoPackageAccess
	NonFinalPublicField
	NonFinalSubclassOfSensitiveInterface
	ObjectFinalize
	PublicFinalizeMethod
	SystemExit
	UnsafeArrayDeclaration
	// rulesets/serialization.xml
	EnumCustomSerializationIgnored
	SerialPersistentFields
	SerialVersionUID
	SerializableClassMustDefineSerialVersionUID
	// rulesets/size.xml
	AbcMetric   // Requires the GMetrics jar
	ClassSize
//    CrapMetric   // Requires the GMetrics jar and a Cobertura coverage file
	CyclomaticComplexity   // Requires the GMetrics jar
	MethodCount
	MethodSize
	NestedBlockDepth
	ParameterCount
	// rulesets/unnecessary.xml
	AddEmptyString
	ConsecutiveLiteralAppends
	ConsecutiveStringConcatenation
	UnnecessaryBigDecimalInstantiation
	UnnecessaryBigIntegerInstantiation
	UnnecessaryBooleanExpression
	UnnecessaryBooleanInstantiation
	UnnecessaryCallForLastElement
	UnnecessaryCallToSubstring
	UnnecessaryCast
	UnnecessaryCatchBlock
	UnnecessaryCollectCall
	UnnecessaryCollectionCall
	UnnecessaryConstructor
	UnnecessaryDefInFieldDeclaration
	UnnecessaryDefInMethodDeclaration
	UnnecessaryDefInVariableDeclaration
	UnnecessaryDotClass
	UnnecessaryDoubleInstantiation
	UnnecessaryElseStatement
	UnnecessaryFinalOnPrivateMethod
	UnnecessaryFloatInstantiation
	UnnecessaryGString
	UnnecessaryGetter
	UnnecessaryIfStatement
	UnnecessaryInstanceOfCheck
	UnnecessaryInstantiationToGetClass
	UnnecessaryIntegerInstantiation
	UnnecessaryLongInstantiation
	UnnecessaryModOne
	UnnecessaryNullCheck
	UnnecessaryNullCheckBeforeInstanceOf
	UnnecessaryObjectReferences
	UnnecessaryOverridingMethod
	UnnecessaryPackageReference
	UnnecessaryParenthesesForMethodCallWithClosure
	UnnecessaryPublicModifier
//    UnnecessaryReturnKeyword
	UnnecessarySelfAssignment
	UnnecessarySemicolon
	UnnecessaryStringInstantiation
	UnnecessarySubstring
	UnnecessaryTernaryExpression
//    UnnecessaryToString
	UnnecessaryTransientModifier
	// rulesets/unused.xml
	UnusedArray
	UnusedMethodParameter
	UnusedObject
	UnusedPrivateField
	UnusedPrivateMethod
	UnusedPrivateMethodParameter
	UnusedVariable
}
