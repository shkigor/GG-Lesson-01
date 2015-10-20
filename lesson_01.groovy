import java.text.SimpleDateFormat
import static java.lang.Math.*

boolean isShortVersion = false

GregorianCalendar birthdayCalendar = new GregorianCalendar(1978, Calendar.DECEMBER, 11);
Calendar now = Calendar.instance

int daysOfYear = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_YEAR)
byte yearsold = (now.minus(birthdayCalendar))/daysOfYear

String name = "Igor"
def experience = 0.5

def animals = ['dog':'Baton', 'cat':'Tuzik']

def myIntroShortVersion = $/Hello! My name is $name.
I am $yearsold years old.
I am learning Groovy language for about $experience months./$

def myIntroLongVersion = /${myIntroShortVersion}My home animals are ${ animals.keySet().join(" and ") }.
Their names are ${ animals.values().join(" and ") }./

int number = 52
int degree = 3

assert number ** degree == pow(number, degree)
assert number ** degree == round(exp(degree * log(number)))

if (isShortVersion) {
    myIntroShortVersion
} else {
    myIntroLongVersion
}
