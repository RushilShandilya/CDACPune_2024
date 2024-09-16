#include <type_traits>
int main()
{
    int arr[2] = {};
    static_assert(std::is_same_v<decltype(arr[0]), int&>);
}
