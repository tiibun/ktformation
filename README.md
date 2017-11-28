# AWS ktformation

![Apache-2.0](https://img.shields.io/badge/Licence-Apache%202.0-blue.svg)

`KtFormation` is a Kotlin port of [GoFormaion](https://github.com/awslabs/goformation) which is a Go library for working with AWS CloudFormation / AWS Serverless Application Model (SAM) templates.

## Main features

 * Describe AWS CloudFormation and AWS SAM templates as Kotlin objects, and then turn it into JSON/YAML.
 * Automatically generated, from the published AWS CloudFormation Resource Specification.

## Usage

### Marshalling CloudFormation/SAM described with Kotlin objects, into YAML/JSON

Below is an example of building a CloudFormation template programmatically, then outputting the resulting JSON

```kotlin
import ktformation.*

fun main(args: Array<String>) {

    // Create a new CloudFormation template
    val template = cloudFormation {
        lateinit var cidrBlock: Parameter
        parameters {
            cidrBlock = parameter("CidrBlock") {
                type = ParameterType.STRING
                default = "10.0.0"
                description = "CIDR block."
            }
        }
        mappings {
            mapping("AWSRegionToAMI",
                    "ap-southeast-2" to mapOf("AMIID" to "ami-5781be34"))
        }
        resources {
            awsEC2VPC("VPC") {
                properties {
                    cidrBlock(Ref(cidrBlock))
                }
            }
        }
    }
    println(template.toJSON(true))
    println(template.toYAML(true))
}
```

Would output the following JSON template:

```javascript
{
  "AWSTemplateFormatVersion" : "2010-09-09",
  "Parameters" : {
    "CidrBlock" : {
      "Type" : "String",
      "Default" : "10.0.0",
      "Description" : "CIDR block."
    }
  },
  "Mappings" : {
    "AWSRegionToAMI" : {
      "ap-southeast-2" : {
        "AMIID" : "ami-5781be34"
      }
    }
  },
  "Resources" : {
    "VPC" : {
      "Type" : "AWS::EC2::VPC",
      "Properties" : {
        "CidrBlock" : {
          "Ref" : "CidrBlock"
        }
      }
    }
  }
}
```

...and the following YAML template:

```yaml
AWSTemplateFormatVersion: '2010-09-09'
  Mappings:
    AWSRegionToAMI:
      ap-southeast-2:
        AMIID: ami-5781be34
  Parameters:
    CidrBlock:
      Default: 10.0.0
      Description: CIDR block.
      Type: String
  Resources:
    VPC:
      Properties:
        CidrBlock: !Ref 'CidrBlock'
      Type: AWS::EC2::VPC
```
