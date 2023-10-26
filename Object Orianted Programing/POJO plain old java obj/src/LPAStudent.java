// record header sets up pvt fields that cant be modified,
// generates toString out each attribute creates public
// accessors for each component accessors for records is the name of method no get set
//they automatically generate constructor methods, accessors (getters), equals(), hashCode(),
// and toString() methods based on the class's components (fields).
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}
