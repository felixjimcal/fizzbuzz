# FizzBuzz kata with TDD
## Getting Started

Fizz buzz is a group word game for children to teach them about division.
Players take turns to count incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
Check the wiki: https://en.wikipedia.org/wiki/Fizz_buzz

### Prerequisites

You need an IDE to run the test in Java

Like Eclipse in Ubuntu 14.04
```
sudo add-apt-repository ppa:ubuntu-desktop/ubuntu-make
sudo apt-get update
sudo apt-get install ubuntu-make
umake ide eclipse
```
## Running the tests

To run the test just open it with the IDE and press "run all test" button

### Break down into end to end tests
The test are done with a battery of test with JUnitParameters, feel free tho change the entry value and expected answer.

For example in test
```
  @Test
    @Parameters({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz",
            "12,Fizz"})
    public void CollectionMultipleOf3(int numb, String result) throws Exception {
        String actual = m_class.CheckNumber(numb);
        assertEquals(result, actual);
    }

    @Test
    @Parameters({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz",
            "25, Buzz"})
    public void CollectionMultipleOf5(int numb, String result) throws Exception {
        String actual = m_class.CheckNumber(numb);
        assertEquals(result, actual);
    }
```

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Felix Jimenez Calvo** - *Initial work* - [felixjimcal](https://github.com/felixjimcal)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* The people who challenge me to improve my knowledge
