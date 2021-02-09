package ossrh.test

import spock.lang.Specification

class LibraryTest extends Specification {

  def "someLibraryMethod returns true"() {
    setup:
    def lib = new Library()

    expect:
    lib.someLibraryMethod()
  }
}
