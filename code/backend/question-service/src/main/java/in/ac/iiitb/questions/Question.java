package in.ac.iiitb.questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question{
    private int id;
    private String type;
    private String questionText;
    private String solutionProposed;
    private int itemAuthorId;
}