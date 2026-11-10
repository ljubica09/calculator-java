# TEST RESULTS – Calculator

## Test environment
- Operating system: Windows 10
- Java version: OpenJDK 21.0.13
- Application: Java Calculator
- Testing type: Black-box / System testing

## Test cases

| ID | Input | Expected result | Actual result | Status |
|---|---|---|---|---|
| TC01 | `10+5*4+3` | 33.0 | 33.0 | PASS |
| TC02 | `2+3*4` | 14.0 | 14.0 | PASS |
| TC03 | `10-3-2` | 5.0 | 5.0 | PASS |
| TC04 | `10/2+3` | 8.0 | 8.0 | PASS |
| TC05 | `5-2*3` | -1.0 | -1.0 | PASS |
| TC06 | `4+` | Error message | 4.0 | FAIL |
| TC07 | `5*-2` | -10.0 | ERROR | FAIL |

## Defects and observations

**BUG01 – Incomplete expression is accepted**

Input: `4+`

Expected: The calculator should reject the incomplete expression.

Actual: The calculator returns `4.0`.

**BUG02 – Negative number after multiplication is not supported**

Input: `5*-2`

Expected: `-10.0`

Actual: `ERROR`

## Summary

- Total test cases: 7
- Passed: 5
- Failed: 2

The calculator correctly handles the tested arithmetic expressions and operator precedence in the successful test cases. Two issues were identified during testing.