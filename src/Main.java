class Project {
    private String tasks;
    private String deadline;
    private String manager;
    private int budget;

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void showProject() {
        System.out.println("Project Manager: " + manager);
        System.out.println("Deadline: " + deadline);
        System.out.println("Budget: $" + budget);
        System.out.println("Tasks: " + tasks);
    }
}

abstract class ProjectBuilder {
    protected Project project;

    public ProjectBuilder() {
        project = new Project();
    }

    public abstract void addTasks();
    public abstract void setDeadline();
    public abstract void setManager();
    public abstract void setBudget();

    public Project getProject() {
        return project;
    }
}

class SoftwareProjectBuilder extends ProjectBuilder {
    @Override
    public void addTasks() {
        project.setTasks("Проектирование системы, Разработка серверной части, Создание клиентской части, Тестирование");
        System.out.println("Задачи добавлены для проекта разработки");

    }

    @Override
    public void setDeadline() {
        project.setDeadline("2025-01-01");
        System.out.println("Добавлен дедлайн для проекта разработки");
    }

    @Override
    public void setManager() {
        project.setManager("Чепырка Мизинчикова");
        System.out.println("Менеджер по разработке назначен");
    }

    @Override
    public void setBudget() {
        project.setBudget(50000);
        System.out.println("Добавлен бюджет для проекта разработки");
    }
}

// Класс MarketingCampaignBuilder для создания проекта маркетинговой кампании
class MarketingCampaignBuilder extends ProjectBuilder {
    @Override
    public void addTasks() {
        project.setTasks("Маркетинговое исследование, Стратегия разработки, Запуск кампании, Анализ результатов");
        System.out.println("Задачи добавлены в строитель маркетинговой кампании");
    }

    @Override
    public void setDeadline() {
        project.setDeadline("2024-12-01");
        System.out.println("Добавлен дедлайн для маркетинговой кампании.");
    }

    @Override
    public void setManager() {
        project.setManager("Крош Солевой");
        System.out.println("Менеджер для маркетинговой кампании назначен.");
    }

    @Override
    public void setBudget() {
        project.setBudget(20000);
        System.out.println("Добавлен бюджет для маркетинговой кампании.");
    }


    class EventOrganizationBuilder extends ProjectBuilder {
        @Override
        public void addTasks() {
            project.setTasks("Бронирование площадки, Организация кейтеринга, Приглашение гостей, Координация мероприятий");
            System.out.println("Добавлены задачи для организации мероприятия.");
        }

        @Override
        public void setDeadline() {
            project.setDeadline("2024-11-10");
            System.out.println("Дедлайн установлен для организации мероприятия.");
        }

        @Override
        public void setManager() {
            project.setManager("Пупок Пяточник");
            System.out.println("Менеджер для организации мероприятия назначен.");
        }

        @Override
        public void setBudget() {
            project.setBudget(15000);
            System.out.println("Добавлен бюджет для организации мероприятия.");
        }
    }

}

class ProjectDirector {
    private ProjectBuilder builder;

    public ProjectDirector(ProjectBuilder builder) {
        this.builder = builder;
    }

    public Project constructProject() {
        builder.addTasks();
        builder.setDeadline();
        builder.setManager();
        builder.setBudget();
        return builder.getProject();
    }
}



